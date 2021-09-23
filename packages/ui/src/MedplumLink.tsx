import { Reference, Resource } from '@medplum/core';
import React from 'react';
import { useMedplumRouter } from './MedplumProvider';
import { killEvent } from './utils/dom';

export interface MedplumLinkProps {
  to?: Resource | Reference | string;
  testid?: string;
  onClick?: () => void;
  children: React.ReactNode;
}

export function MedplumLink(props: MedplumLinkProps) {
  const router = useMedplumRouter();

  let href = '#';
  if (props.to) {
    if (typeof props.to === 'string') {
      href = props.to
    } else if ('resourceType' in props.to) {
      href = `/${props.to.resourceType}/${props.to.id}`;
    } else if ('reference' in props.to) {
      href = `/${props.to.reference}`;
    }
  }

  return (
    <a
      href={href}
      data-testid={props.testid || 'link'}
      onClick={(e: React.SyntheticEvent) => {
        killEvent(e);
        if (props.onClick) {
          props.onClick();
        } else if (props.to) {
          router.push(href);
        }
      }}
    >{props.children}</a>
  );
}
